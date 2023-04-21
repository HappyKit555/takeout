package com.yao.takeout.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yao.takeout.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
