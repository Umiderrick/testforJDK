
package dp.pb.test;

import java.util.Comparator;

public class TestArtical implements Comparable<TestArtical>{
	int a;
	int b;
	int sum;
	
	public Article getFirstJavaArticle() {
		 
//	    for (Article article : articles) {
//	        if (article.getTags().contains("Java")) {
//	            return article;
//	        }
//	    }

	    // student chinese, math, physical  ...
		Comparator<TestArtical> cmprA = (a,b)->{ return a.a - b.a;};
		Comparator<TestArtical> cmprB = (a,b)->{ return a.b - b.b;};
		
		// redis cluster 
		// ���л� oJBECT -> BYTE[] {"a":123, "b":123,"c":123}
	    return null;
	}

	@Override
	public int compareTo(TestArtical o) {
		return 0;
	}
}
