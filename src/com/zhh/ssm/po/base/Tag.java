package com.zhh.ssm.po.base;

public class Tag {
    private Integer id;

    private String tagname;

    private String tagdesc;

    private Integer sortindex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }

    public String getTagdesc() {
        return tagdesc;
    }

    public void setTagdesc(String tagdesc) {
        this.tagdesc = tagdesc == null ? null : tagdesc.trim();
    }

    public Integer getSortindex() {
        return sortindex;
    }

    public void setSortindex(Integer sortindex) {
        this.sortindex = sortindex;
    }
}