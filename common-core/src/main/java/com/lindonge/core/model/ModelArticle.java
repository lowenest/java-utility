package com.lindonge.core.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by kyle on 17/5/25.
 */
@Getter
@Setter
public class ModelArticle extends BaseEntity {

    private static final long serialVersionUID = -1;

    private int artid;

    private String title;

    private String body;

    private String author;

    private String url;

}
