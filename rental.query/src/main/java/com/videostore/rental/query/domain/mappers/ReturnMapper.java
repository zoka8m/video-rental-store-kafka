/*
 * Copyright (c) 2024 Zorica Maneva. This source file can not be copied and/or distributed without the express
 * written permission of Zorica Maneva. Any unauthorized use is subject to criminal prosecution.
 */

package com.videostore.rental.query.domain.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.videostore.rental.common.dto.ReturnDto;
import com.videostore.rental.query.domain.enitties.Return;

/**
 * @author Created by Maneva.
 * @since 7.7.24.
 */
@Mapper
public interface ReturnMapper {
    ReturnMapper INSTANCE = Mappers.getMapper(ReturnMapper.class);

    ReturnDto toDto(Return aReturn);
    Return toEntity(ReturnDto returnDto);

}
