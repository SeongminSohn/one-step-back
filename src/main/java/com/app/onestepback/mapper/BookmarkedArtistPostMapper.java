package com.app.onestepback.mapper;

import com.app.onestepback.domain.vo.BookmarkedArtistPostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface BookmarkedArtistPostMapper {
    public Optional<BookmarkedArtistPostVO> select(BookmarkedArtistPostVO bookmarkedArtistPostVO);
    public void insert(BookmarkedArtistPostVO bookmarkedArtistPostVO);
    public void delete(BookmarkedArtistPostVO bookmarkedArtistPostVO);
}
