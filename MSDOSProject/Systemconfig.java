import java.io.File;

public class Systemconfig {
    public static void main(String[] args) {
        /* Total number of processors or cores available to the JVM */
        System.out.println("Available processors (cores): " + 
            Runtime.getRuntime().availableProcessors());
    
        /* Total amount of free memory available to the JVM */
        System.out.println("Free memory (Kilobytes): " + 
            Runtime.getRuntime().freeMemory()/1000);
    
        /* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory();
        /* Maximum amount of memory the JVM will attempt to use */
        System.out.println("Maximum memory (Kilobytes): " + 
            (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory/1000));
    
        /* Total memory currently available to the JVM */
        System.out.println("Total memory available to JVM (Kilobytes): " + 
            Runtime.getRuntime().totalMemory()/1000);
    
        /* Get a list of all filesystem roots on this system */
        File[] roots = File.listRoots();
    
        /* For each filesystem root, print some info */
        for (File root : roots) {
          System.out.println("File system root: " + root.getAbsolutePath());
          System.out.println("Total space (Gigabytes): " + root.getTotalSpace()/1000000000);
          System.out.println("Free space (Gigabytes): " + root.getFreeSpace()/1000000000);
          System.out.println("Usable space (Gigabytes): " + root.getUsableSpace()/1000000000);
        }
      }
    }
    

