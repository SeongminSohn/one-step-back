package com.app.onestepback.repository;

import com.app.onestepback.domain.vo.Pagination;
import com.app.onestepback.domain.dto.PostReplyDTO;
import com.app.onestepback.domain.vo.PostReplyVO;
import com.app.onestepback.mapper.PostReplyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostReplyDAO {
    private final PostReplyMapper postReplyMapper;

    public int getReplyCount(Long postId){
        return postReplyMapper.selectCountOfReplies(postId);
    }

    public List<PostReplyDTO> getAllReplies(Long postId, Pagination pagination){
        return postReplyMapper.selectAll(postId, pagination);
    }

    public void saveReply(PostReplyVO postReplyVO){
        postReplyMapper.insert(postReplyVO);
    }
}
