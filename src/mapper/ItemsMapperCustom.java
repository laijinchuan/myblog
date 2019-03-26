package mapper;

import java.util.List;

import po.ItemsCustom;
import po.ItemsQueryVo;

public interface ItemsMapperCustom {
	//商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}