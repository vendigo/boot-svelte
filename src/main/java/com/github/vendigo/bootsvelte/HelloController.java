package com.github.vendigo.bootsvelte;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/message")
@Slf4j
public class HelloController {

    private final MessageRepository messageRepository;

    @GetMapping
    public List<MessageEntity> getMessages() {
        log.info("Loading all messages");
        return messageRepository.findAll();
    }

    @PostMapping
    public MessageEntity saveMessage(@RequestBody MessageEntity message) {
        return messageRepository.save(message);
    }

    @DeleteMapping("/{messageId}")
    public void deleteMessage(@PathVariable("messageId") Long messageId) {
        messageRepository.deleteById(messageId);
    }
}
