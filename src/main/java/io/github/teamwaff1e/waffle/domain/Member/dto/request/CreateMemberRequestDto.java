package io.github.teamwaff1e.waffle.domain.Member.dto.request;

import io.github.teamwaff1e.waffle.domain.dto.RequestDto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateMemberRequestDto implements RequestDto {
    @NotBlank
    private String email;
    private String name;
    private String password;
    private String nickname;
}
