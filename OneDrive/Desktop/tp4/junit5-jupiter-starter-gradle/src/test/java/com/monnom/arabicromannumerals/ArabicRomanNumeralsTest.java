package com.monnom.arabicromannumerals;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.monnom.arabicromannumerals.ArabicRomanNumeral;


public class ArabicRomanNumeralsTest {
    @Test
    public void testConvert() {
        ArabicRomanNumeral converter = new ArabicRomanNumeral();

        // Test des cas simples
        assertThat(converter.convert(1)).isEqualTo("I");
        assertThat(converter.convert(4)).isEqualTo("IV");
        assertThat(converter.convert(9)).isEqualTo("IX");
        assertThat(converter.convert(58)).isEqualTo("LVIII");
        assertThat(converter.convert(199)).isEqualTo("CXCIX");
        assertThat(converter.convert(2023)).isEqualTo("MMXXIII");
        assertThat(converter.convert(3999)).isEqualTo("MMMCMXCIX");
    }
}
