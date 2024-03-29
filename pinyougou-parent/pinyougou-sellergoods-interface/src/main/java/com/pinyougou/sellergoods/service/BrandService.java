package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

/**
 * 品牌接口
 * @author 张哲
 *
 */
public interface BrandService {
	//查询所有数据
	public List<TbBrand> findAll();
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	/**
	 * 增加
	 * @param brand
	 */
	public void add(TbBrand brand);
	
	/**
	 * 根据id查实体
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);
	
	/**
	 * 修改
	 * @param tbrand
	 */
	public void update(TbBrand tbrand);
		
	/**
	 * 删除
	 * @param ids
	 */
	public void delete(Long [] ids);
	
	/**
	 * 查询
	 * @param brand
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	
	public PageResult findPage(TbBrand brand,int pageNum,int pageSize);
	
	
	/**
	 * 返回下拉列表的实现
	 * @return
	 */
	public List<Map> selectOptionList();
}
