package com.change.mapper;

import com.change.pojo.Tree;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TreeMapper {

    public List<Tree> queryByUserId(String userId);

    public void addTree(Tree tree);
}
