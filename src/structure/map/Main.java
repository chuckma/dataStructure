package structure.map;

import structure.BST.BST;

import java.util.ArrayList;

/**
 * @Author lucasma
 * @Date 2018/5/17 下午10:29
 */
public class Main {

    private static double testMap(Map<String, Integer> map, String fileName) {
        long startTime = System.nanoTime();


        System.out.println("Pride and Prejudice");

        // /Users/lucasma/IdeaProjects/dataStructure/src/structure/map/Pride.txt

        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile(fileName, words)) {
            System.out.println("Total words: " + words.size());

            for (String word : words) {
                if (map.contains(word))
                    map.set(word, map.get(word) + 1);
                else
                    map.add(word, 1);
            }

            System.out.println("Total different words: " + map.getSize());
            System.out.println("Frequency of PRIDE: " + map.get("pride"));
            System.out.println("Frequency of PREJUDICE: " + map.get("prejudice"));
        }

        System.out.println();

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {

        String fileName = "/Users/lucasma/IdeaProjects/dataStructure/src/structure/map/Pride.txt";
        BSTMap<String, Integer> bstMap = new BSTMap<>();
        double time1 = testMap(bstMap, fileName);
        System.out.println("BSTMap:" + time1 + " s");
        System.out.println();

        LinkedListMap<String, Integer> linkedListMap = new LinkedListMap<>();
        double time2 = testMap(linkedListMap, fileName);
        System.out.println("LinkedListMap :"+ time2+" s");
    }
}
