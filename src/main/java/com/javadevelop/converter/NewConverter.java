package com.javadevelop.converter;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.javadevelop.dto.NewDTO;
import com.javadevelop.entity.NewEntity;

@Component
public class NewConverter {

	public NewEntity toNewEntity (NewDTO newDTO) {
		NewEntity entity = new NewEntity();
		entity.setTitle(newDTO.getTitle());
		entity.setContent(newDTO.getContent());
		entity.setShortDescription(newDTO.getShortDescription());
		entity.setThumbnail(newDTO.getThumbnail());
		return entity;
	}
	
	public NewDTO toNewDTO(NewEntity newEntity) {
		NewDTO newDTO = new NewDTO();
		if(newEntity.getId() != null) {
			newDTO.setId(newEntity.getId());
		}
		newDTO.setTitle(newEntity.getTitle());
		newDTO.setContent(newEntity.getContent());
		newDTO.setShortDescription(newEntity.getShortDescription());
		newDTO.setThumbnail(newEntity.getThumbnail());
		newDTO.setCreatedBy(newEntity.getCreatedBy());
		newDTO.setCreatedDate(newEntity.getCreatedDate());
		newDTO.setModifiedBy(newEntity.getModifiedBy());
		newDTO.setModifiefdDate(newEntity.getModifiefdDate());
		return newDTO;
	}
	
	public NewEntity toNewEntity (NewDTO newDTO, NewEntity entity) {
		entity.setTitle(newDTO.getTitle());
		entity.setContent(newDTO.getContent());
		entity.setShortDescription(newDTO.getShortDescription());
		entity.setThumbnail(newDTO.getThumbnail());
		return entity;
	}
	
	public List<NewDTO> toNewDTO(List<NewEntity> newEntityLists) {
		NewDTO newDTO = new NewDTO();
		List<NewDTO> arrayList = new ArrayList<>();
		for(NewEntity newEntity : newEntityLists) {
			if(newEntity.getId() != null) {
				newDTO.setId(newEntity.getId());
			}
			newDTO.setTitle(newEntity.getTitle());
			newDTO.setContent(newEntity.getContent());
			newDTO.setShortDescription(newEntity.getShortDescription());
			newDTO.setThumbnail(newEntity.getThumbnail());
			newDTO.setCreatedBy(newEntity.getCreatedBy());
			newDTO.setCreatedDate(newEntity.getCreatedDate());
			newDTO.setModifiedBy(newEntity.getModifiedBy());
			newDTO.setModifiefdDate(newEntity.getModifiefdDate());
			arrayList.add(newDTO);
		}
//			newDTO.setListResult(arrayList);
//			return newDTO.getListResult(); // Tr??? v??? list trong m???t NewDTO (v?? NewDTO extends BaseDTO n??n m???i NewDTO ?????u c?? thu???c t??nh list) => v??ng l???p v?? h???n
			return arrayList;	// Tr??? v??? list ch???a c??c NewDTO
	}
		
	
}
