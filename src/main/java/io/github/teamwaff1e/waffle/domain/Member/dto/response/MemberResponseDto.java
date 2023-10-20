package io.github.teamwaff1e.waffle.domain.Member.dto.response;

import io.github.teamwaff1e.waffle.domain.dto.ResponseDto;
import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@Builder
public class MemberResponseDto implements ResponseDto {

    private Long id;
    private String email;
    private String pwd;
    private String name;
    private String nickname;
    private String profileUrl;
    private Timestamp updatedAt;

}