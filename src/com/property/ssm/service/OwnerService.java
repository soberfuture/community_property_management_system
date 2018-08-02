package com.property.ssm.service;

import java.util.List;
import java.util.Map;

import com.property.ssm.po.Owner;

public interface OwnerService {
    int deleteByPrimaryKey(Integer ownerId);

    int insert(Owner record);

    int insertSelective(Owner record);

    Owner selectByPrimaryKey(Integer ownerId);

    int updateByPrimaryKeySelective(Owner record);

    int updateByPrimaryKey(Owner record);
    
    int findCount();//所有记录数
    
    List<Owner> findByPagination(Map<String, Integer> map);//按分页查询所有记录    

	void addOwner(Owner owner, String position);
}
