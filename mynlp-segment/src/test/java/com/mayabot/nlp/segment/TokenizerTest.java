package com.mayabot.nlp.segment;

import org.junit.Test;

public class TokenizerTest {




    @Test
    public void test() {
        MynlpTokenizer mynlpTokenizer = MynlpSegments.nlpTokenizer();
        System.out.println(mynlpTokenizer.tokenToList("优酷总裁魏明介绍了优酷2015年的内容战略，表示要以“大电影、大网剧、大综艺”为关键词\""));
    }

    @Test
    public void testDisableTime() {
        MynlpTokenizer mynlpTokenizer = MynlpSegments.tokenizerBuilder().disable(ComponentNames.person).build();

        System.out.println(mynlpTokenizer.tokenToItemList("优酷总裁魏明介绍了优酷2015年的内容战略，表示要以“大电影、大网剧、大综艺”为关键词\""));
    }


}
