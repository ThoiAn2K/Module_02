import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NewsScraper {

    public static void main(String[] args) {
        String url = "https://dantri.com.vn/the-gioi.htm";
        try {
            String htmlContent = getHtmlContent(url);
            List<NewsItem> newsList = extractNews(htmlContent);
            System.out.println("Number of news items: " + newsList.size());
            for (NewsItem news : newsList) {

                System.out.println("Title: " + news.getTitle());
                System.out.println("URL: " + news.getUrl());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getHtmlContent(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        return doc.html();
    }

    private static List<NewsItem> extractNews(String htmlContent) {
        List<NewsItem> newsList = new ArrayList<>();
        String pattern = "<a class=\"news-item__title\" href=\"([^\"]+)\">([^<]+)</a>";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(htmlContent);
        while (matcher.find()) {
            String url = matcher.group(1);
            String title = matcher.group(2);
            newsList.add(new NewsItem(title, url));
        }
        return newsList;
    }
    private static class NewsItem {
        private String title;
        private String url;

        public NewsItem(String title, String url) {
            this.title = title;
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public String getUrl() {
            return url;
        }
    }
}