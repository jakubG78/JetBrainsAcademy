class StringOperations {

    public static class EngString {
        private boolean english;
        private String string;

        public EngString(boolean english, String string) {
            this.english = english;
            this.string = string;
        }

        public boolean isEnglish() {
            return english;
        }

        public String getString() {
            return string;
        }
    }

}