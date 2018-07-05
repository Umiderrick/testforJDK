package dp.pb.test.serialize;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ObjectTes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8200327173157016985L;
	
	private final String title;
    private final String author;
    private final List<String> tags; 
    private final Set<String> error;
    private final Map<String,String> recommend;

    public ObjectTes(String title, String author, List<String> tags,Set<String> error,Map<String,String> recommend) {
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

	@Override
	public String toString() {
		return "ObjectTes [title=" + title + ", author=" + author + ", tags=" + tags + ", error=" + error
				+ ", recommend=" + recommend + "]";
	}
	
	
}
