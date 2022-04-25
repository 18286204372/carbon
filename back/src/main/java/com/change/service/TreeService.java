package com.change.service;

import com.change.pojo.Tree;

import java.util.List;

public interface TreeService {

    public String addTree(String userId,String treeType);

    public List<Tree> queryMyTree(String userId);
}
