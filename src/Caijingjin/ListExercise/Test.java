package Caijingjin.ListExercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * 分组实现
 */
public class Test{
    //实体类
    class Apple {
        String color;
        int weight;

        Apple(String color, int weight) {
            super();
            this.color = color;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "颜'" + color + '\'' +
                    ", 重：" + weight +
                    '}';
        }
    }


    public static void main(String args[]){
        List<Apple> list = new ArrayList<>();
        list.add(new Test().new Apple("红", 205));
        list.add(new Test().new Apple("绿", 248));
        list.add(new Test().new Apple("红", 131));
        list.add(new Test().new Apple("黄", 119));
        list.add(new Test().new Apple("绿", 153));
        list.add(new Test().new Apple("黄", 224));
        //按颜色分组
        List<List<Apple>> byColorList = byColorGroupApple(list,
                Comparator.comparing(t -> t.color));
        printList(byColorList);
        //按重量级分组
        List<List<Apple>> byWeightList = byColorGroupApple(list,
                (t1, t2) -> t1.weight/100 == t2.weight/100 ? 0:1);
        printList(byWeightList);
    }

    private static void printList(List<List<Apple>> byColorList) {
        System.out.println("分组后："+byColorList);
    }

    /**
     * 根据传入的比较器进行集合的分组
     * @param data 需要分组的元素集合
     * @param c 传入的比较器
     * @param <T> 元素
     * @return 返回分组后的集合列表
     */
    private static <T> List<List<T>> byColorGroupApple(Collection<T> data, Comparator<? super T> c) {//方法上使用泛型 记得在返回值前加<T>
        List<List<T>> result = new ArrayList<>();
        for (T t : data) {//1.循环取出集合中的每个元素
            boolean isSameGroup = false;//2.标志为不是同组
            for (List<T> aResult : result) {//4.循环查找当前元素是否属于某个已创建的组
                if (c.compare(t, aResult.get(0)) == 0) {//aResult.get(0)表示：只要当前元素和某个组的第一个元素通过比较器比较相等则属于该组
                    isSameGroup = true;//5.查询到当前元素属于某个组则设置标志位，不让其创键新组
                    aResult.add(t);//6.把当前元素添加到当前组
                    break;
                }
            }
            if (!isSameGroup) {//3.不属于任何组的则创建一个新组，并把元素添加到该组
                // 创建
                List<T> innerList = new ArrayList();
                innerList.add(t);
                result.add(innerList);
            }
        }
        return result;
    }

}