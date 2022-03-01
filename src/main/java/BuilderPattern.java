public class BuilderPattern {
//    public static class Story{
//        String title;
//        public Story(String title){
//            this.title = title;
//        }
//    }
    public static class StoryBuilder{
        private String title;
        private String genre;
        private String setting;
        private String theme;

        public StoryBuilder (String title){
            this.title = title;
        }

        public StoryBuilder setGenre(String genre){
            this.genre = genre;
            return this;
        }

        public StoryBuilder setSetting(String setting){
            this.setting = setting;
            return this;
        }

        public StoryBuilder setTheme(String theme){
            this.theme = theme;
            return this;
        }

        public String toString(){
            String result = "Elements of Story:";
            if (title != null){
                result += "\n\tTitle: " + title;
            }
            if (genre != null){
                result += "\n\tGenre: " + genre;
            }
            if (setting != null){
                result += "\n\tSetting: " + setting;
            }
            if (theme != null){
                result += "\n\tTheme: " + theme;
            }
            return result;
        }
    }

    public static void main(String[] args){
        // Here I'm implementing Builder Pattern by breaking about a Story
        // into its elements, Title, Genre, Setting, and Theme.

        // Because I'm using Builder Pattern I can even initialize a Story
        // without all of its attributes if I still want to do more work
        // on specific parts
        StoryBuilder story = new StoryBuilder("Example Title");
        System.out.println("After Initializing");
        System.out.println(story);

        story = story.setGenre("Example Genre");
        System.out.println("\nAfter Setting Genre");
        System.out.println(story);

        story = story.setSetting("Example Setting");
        System.out.println("\nAfter Setting Setting");
        System.out.println(story);

        story = story.setTheme("Example Theme");
        System.out.println("\nAfter Setting Theme");
        System.out.println(story);
    }
}
