package com.entity.view;

import com.entity.DiscussshangjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商家评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 11:33:21
 */
@TableName("discussshangjia")
public class DiscussshangjiaView  extends DiscussshangjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshangjiaView(){
	}
 
 	public DiscussshangjiaView(DiscussshangjiaEntity discussshangjiaEntity){
 	try {
			BeanUtils.copyProperties(this, discussshangjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
