/**
 * http://surenpi.com
 */
package org.suren.autotest.platform.entity;

import java.util.Date;

import org.suren.autotest.platform.schemas.datasource.DataSources;


/**
 * @author suren
 * @date 2017年1月21日 上午11:01:50
 */
public class DataSourceInfo
{
	private String id;
	private String projectId;
	private String pageId;
	private String name;
	private String type;
	private String resource;
	private String content;
	private Date createTime;
	private String remark;
	private DataSources dataSources;
	private int tabIndex;
	/**
	 * @return the id
	 */
	public String getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id)
	{
		this.id = id;
	}
	/**
	 * @return the projectId
	 */
	public String getProjectId()
	{
		return projectId;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(String projectId)
	{
		this.projectId = projectId;
	}

	public String getPageId()
	{
		return pageId;
	}

	public void setPageId(String pageId)
	{
		this.pageId = pageId;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
	}
	/**
	 * @return the resource
	 */
	public String getResource()
	{
		return resource;
	}
	/**
	 * @param resource the resource to set
	 */
	public void setResource(String resource)
	{
		this.resource = resource;
	}
	/**
	 * @return the content
	 */
	public String getContent()
	{
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content)
	{
		this.content = content;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime()
	{
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime)
	{
		this.createTime = createTime;
	}
	/**
	 * @return the remark
	 */
	public String getRemark()
	{
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark)
	{
		this.remark = remark;
	}
	/**
	 * @return the dataSources
	 */
	public DataSources getDataSources()
	{
		return dataSources;
	}
	/**
	 * @param dataSources the dataSources to set
	 */
	public void setDataSources(DataSources dataSources)
	{
		this.dataSources = dataSources;
	}
	/**
	 * @return the tabIndex
	 */
	public int getTabIndex()
	{
		return tabIndex;
	}
	/**
	 * @param tabIndex the tabIndex to set
	 */
	public void setTabIndex(int tabIndex)
	{
		this.tabIndex = tabIndex;
	}
}
