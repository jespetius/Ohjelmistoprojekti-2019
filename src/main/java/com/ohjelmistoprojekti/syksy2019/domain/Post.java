package com.ohjelmistoprojekti.syksy2019.domain;

public class Post {
	 private final long id;
	    private String content;
	    private String q;
	    
	    public Post(long id, String content, String q) {
	        this.id = id;
	        this.content = content;
	        this.q = q;
	    }

	    public String getQ() {
			return q;
		}

		public long getId() {
	        return id;
	    }

	    public String getContent() {
	        return content;
	    }
	    
	    public void setQ(String q) {
			this.q=q;
		}
	    
}
