package com.github.article.service;

import com.github.article.po.Article;

public interface ArticleService {

	/**
	 * 保存文章
	 * @param  article	文章信息对象
	 * @return 新增之后的文章ID
	 */
	String saveArticle(Article article);
	
}