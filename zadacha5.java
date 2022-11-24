public String foo(String text){
        Pattern p = Pattern.compile("[^\\p{L}]+");
        Matcher m = p.matcher(text);
        List<String> result = new ArrayList<>();
        while (m.find())result.add(m.group());
        return result.stream().max(Comparator.comparingInt(String::length)).get();
    }
