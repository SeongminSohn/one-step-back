package com.app.onestepback.artist;

import com.app.onestepback.domain.dto.ArtistPostDTO;
import com.app.onestepback.domain.vo.Pagination;
import com.app.onestepback.mapper.ArtistPostMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ArtistPostMapperTest {
    @Autowired
    private ArtistPostMapper artistPostMapper;
    @Test
    public void selectAllTest(){
        artistPostMapper.select3Posts(1L).stream().map(ArtistPostDTO::toString).forEach(log::info);
    }

    @Test
    public void paginationTest(){
        Pagination pagination = new Pagination();
        pagination.setStartRow(1);
        pagination.setEndRow(10);
        artistPostMapper.selectAll(1L, pagination).stream().map(ArtistPostDTO::toString).forEach(log::info);
    }

    @Test
    public void insertPostTest(){
        ArtistPostDTO artistPostDTO = new ArtistPostDTO();

        artistPostDTO.setMemberId(41L);
        artistPostDTO.setPostTitle("맵퍼 테스트 글");
        artistPostDTO.setPostSubtitle("맵퍼 테스트 서브제목");
        artistPostDTO.setPostContent("내용");
        artistPostDTO.setPostCategory("카테고리");
        artistPostMapper.insertPost(artistPostDTO);
        log.info(String.valueOf(artistPostDTO.getId()));
    }

    @Test
    public void insertArtistPostTest(){
        artistPostMapper.insertArtistPost(122L);
    }

    @Test
    public void selectPrevPost(){
        ArtistPostDTO artistPostDTO = artistPostMapper.select(141L);

        log.info(String.valueOf(artistPostMapper.selectPrevPost(artistPostDTO)));
    }

    @Test
    public void selectNextPost(){
        ArtistPostDTO artistPostDTO = artistPostMapper.select(137L);

        log.info(String.valueOf(artistPostMapper.selectNextPost(artistPostDTO)));
    }

    @Test
    public void updatePostTest(){
        ArtistPostDTO artistPostDTO = new ArtistPostDTO();

        artistPostDTO.setId(141L);
        artistPostDTO.setPostTitle("게시글 테스트");
        artistPostDTO.setPostSubtitle("수정을해볼까?");
        artistPostDTO.setPostContent("수정이 될까?");
        artistPostDTO.setPostCategory("테스트");

        artistPostMapper.update(artistPostDTO);
    }
}
