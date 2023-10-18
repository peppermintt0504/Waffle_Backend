package io.github.teamwaff1e.waffle.domain.comment.dto.converter;

import io.github.teamwaff1e.waffle.domain.comment.dto.response.CommentResponseDto;
import io.github.teamwaff1e.waffle.domain.comment.entity.Comment;
import io.github.teamwaff1e.waffle.domain.dto.converter.DtoConverter;

public class CommentToResponseConverter implements DtoConverter<Comment, CommentResponseDto> {

    @Override
    public CommentResponseDto convert(Comment comment) {
        return CommentResponseDto.builder()
                .id(comment.getId())
                .waffleId((comment.getWaffleId()))
                .content(comment.getContent())
                .updatedAt(comment.getUpdatedAt())
                .build();
    }
}
