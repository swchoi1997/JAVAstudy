package collectionFramwork;

import java.util.*;

public class MyStack1 {

    public static void main(String[] args) {
        List list = new ArrayList(Arrays.asList("NAVER", "GOOGLE", "YAHOO", "DAUM"));

        // 연습삼아 builder 패턴 만들어봄
        BackOrForward bf = BackOrForward.builder().list(list).build();
        System.out.println(bf.getList().toString());

        // 아무페이지도 들어가지 않는 상황에서 현재 페이지 가져오기
        // 네이버 구글 야후 다음 순서대로 들어가기
        bf.enterSite("naver");
        bf.enterSite("google");
        bf.enterSite("yahoo");
        bf.enterSite("daum");
        bf.enterSite("daum");

        bf.enterSite("yahoo");
        System.out.println();

        bf.back();

        bf.forward();

        bf.back();
        bf.back();
        bf.back();
        bf.back();
        bf.enterSite("naver");
        bf.back();




    }
}

class BackOrForward {

    private static Stack current = new Stack();

    private static Stack history = new Stack();

    private List list;


    public BackOrForward(){}

    public BackOrForward(List list) {
        this.list = list;
    }

    public static BackOrForward.BackOrForwardBuilder builder(){
        return new BackOrForward.BackOrForwardBuilder();
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public static class BackOrForwardBuilder {
        private List list;

        public BackOrForwardBuilder(){}

        public BackOrForward.BackOrForwardBuilder list(final List list) {
            this.list = list;
            return this;
        }

        public BackOrForward build(){
            return new BackOrForward(this.list);
        }
    }

    public void enterSite(String site) {
        if (this.list.contains(site.toUpperCase(Locale.ROOT))) {
            if (!current.isEmpty() && current.get(current.size() - 1).equals(site.toUpperCase(Locale.ROOT))) {
                System.out.println("같은 페이지 입니다. === 새로고침 실행 ===");
                return;
            }
            current.add(list.get(list.indexOf(site.toUpperCase(Locale.ROOT))));
        } else {
            System.out.println(site + " page doesn't exist");
            return;
        }
        System.out.println(getCurPage());
    }

    public void back() {
        if (current.isEmpty()) {
            System.out.println("first page");
            return;
        }
        Object pop = current.pop();
        history.add(pop);
        System.out.println(getCurPage());
    }

    public void forward(){
        if (history.isEmpty()) {
            System.out.println("history not exist");
            return;
        }
        Object pop = history.pop();
        current.add(pop);

        System.out.println(getCurPage());
    }

    public Object getCurPage() {
        if (current.isEmpty()) {
            return "아무 페이지도 들어가지 않으셨습니다.";
        }
        return "현재 페이지는 " + current.get(current.size() - 1) + " 입니다.";
    }


    @Override
    public String toString() {
        return "BackOrForward{" +
                "list=" + list +
                '}';
    }
}
