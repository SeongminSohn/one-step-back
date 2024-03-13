package com.app.onestepback.service.file;

import com.app.onestepback.domain.vo.PostLikeVO;

import java.util.Optional;

public interface PostLikeService {
    public Optional<PostLikeVO> checkPostLike(PostLikeVO postLikeVO);

    public void saveLike(PostLikeVO postLikeVO);

    public void eraseLike(PostLikeVO postLikeVO);
}
