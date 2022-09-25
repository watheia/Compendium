/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.watheia.compendium.app;

import static com.watheia.compendium.utilities.StringUtils.join;
import static com.watheia.compendium.utilities.StringUtils.split;
import static com.watheia.compendium.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

import com.watheia.compendium.utilities.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
