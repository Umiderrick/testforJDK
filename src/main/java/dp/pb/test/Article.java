package dp.pb.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Article {

	private final String title;
    private final String author;
    private final List<String> tags; 
    private final Set<String> error;
    private final Map<String,String> recommend;

    private Article(String title, String author, List<String> tags,Set<String> error,Map<String,String> recommend) {
        this.title = title;
        this.author = author;
        this.tags = tags;
        this.error = error;
        this.recommend =recommend;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getTags() {
        return tags;
    }

	public Set<String> getError() {
		return error;
	}

	public Map<String, String> getRecommend() {
		return recommend;
	}
	
	
    
}
