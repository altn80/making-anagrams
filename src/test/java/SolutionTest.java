
import com.novaes.making.anagrams.Solution;
import org.junit.Assert;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kbos
 */
public class SolutionTest {

    @Test
    public void testAnagram1() {
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        Assert.assertSame(Solution.makeAnagram(a, b), 30);

    }

}
