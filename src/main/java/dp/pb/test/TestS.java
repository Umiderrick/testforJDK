package dp.pb.test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestS {
	private enum Status {
        OPEN, CLOSED
    };

    private static final class Task {
        private final Status status;
        private final Integer points;

        Task( final Status status, final Integer points ) {
            this.status = status;
            this.points = points;
        }

        public Integer getPoints() {
            return points;
        }

        public Status getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return String.format( "[%s, %d]", status, points );
        }
    }
    
    public static void main(String[] args){
//    	
//    	int num1 = 7;
//
//		int num2 = 9;
//
//		// 创建一个数值格式化对象
//
//		NumberFormat numberFormat = NumberFormat.getInstance();
//
//		// 设置精确到小数点后2位
//
//		numberFormat.setMaximumFractionDigits(2);
//
//		String asf = numberFormat.format((float) num1 / (float) num2 * 100);
//
//		System.out.println("num1和num2的百分比为:" + asf + "%");
//    	
//    	final Collection< Task > tasks = Arrays.asList(
//			    new Task( Status.OPEN, 5 ),
//			    new Task( Status.OPEN, 13 ),
//			    new Task( Status.CLOSED, 8 ) 
//			);
//		
//		final long totalPointsOfOpenTasks = tasks
//			    .stream()
//			    .parallel()
//			    .filter( task -> task.getStatus() == Status.OPEN )
//			    .mapToInt( Task::getPoints )
//			    .sum();
//		
//		final double totalPoints = tasks
//				   .stream()
//				   .parallel()
//				   .map( task -> task.getPoints() ) // or map( Task::getPoints ) 
//				   .reduce( 0, Integer::sum );
//		final Map< Status, List< Task > > map = tasks
//			    .stream()
//			    .collect( Collectors.groupingBy( Task::getStatus ) );
//		final Collection< String > result = tasks
//			    .stream()                                        // Stream< String >
//			    .mapToInt( Task::getPoints )                     // IntStream
//			    .asLongStream()                                  // LongStream
//			    .mapToDouble( points -> points / totalPoints )   // DoubleStream
//			    .boxed()                                         // Stream< Double >
//			    .mapToLong( weigth -> ( long )( weigth * 100 ) ) // LongStream
//			    .mapToObj( percentage -> percentage + "%" )      // Stream< String> 
//			    .collect( Collectors.toList() );                 // List< String > 
//		String filename ="F://test.txt";
//		final Path path = new File( filename ).toPath();
//		try( Stream< String > lines = Files.lines( path, StandardCharsets.UTF_8 ) ) {
//		    lines.onClose( () -> System.out.println("Done!") ).forEach( System.out::println );
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//			System.out.println( result );
//			System.out.println( map );
//		System.out.println(totalPointsOfOpenTasks);
//		System.out.println(totalPoints);
    	
    	Map map =new HashMap<String, Integer>();
    	map.get("12123");
	}
}
