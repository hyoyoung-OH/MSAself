package com.jojoldu.book.webprojectpractice.service.posts;



import com.jojoldu.book.webprojectpractice.domain.posts.PostsRepository;
import com.jojoldu.book.webprojectpractice.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}