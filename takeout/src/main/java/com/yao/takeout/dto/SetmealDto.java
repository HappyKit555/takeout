package com.yao.takeout.dto;

import com.yao.takeout.entity.Setmeal;
import com.yao.takeout.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
