package oop2.module08.multilanguage_solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dieter Holz
 */
class MultiLanguagePMTest {

	@Test
	void testSetLanguageToGerman() {
		//given
		MultiLanguagePM languagePM = new MultiLanguagePM();

		//when
		languagePM.setLanguage(MultiLanguagePM.Lang.DE);

		//then
		assertEquals(MultiLanguagePM.Caption.WINDOW_TITLE.getGerman(),        languagePM.getApplicationTitle());
		assertEquals(MultiLanguagePM.Caption.LABEL_TEXT.getGerman(),          languagePM.getLabelText());
		assertEquals(MultiLanguagePM.Caption.GERMAN_BUTTON_TEXT.getGerman(),  languagePM.getGermanButtonText());
		assertEquals(MultiLanguagePM.Caption.ENGLISH_BUTTON_TEXT.getGerman(), languagePM.getEnglishButtonText());
	}

	@Test
	void testSetLanguageToEnglish() {
		//given
		MultiLanguagePM languagePM = new MultiLanguagePM();

		//when
		languagePM.setLanguage(MultiLanguagePM.Lang.EN);

		//then
		assertEquals(MultiLanguagePM.Caption.LABEL_TEXT.getEnglish() ,         languagePM.getLabelText());
		assertEquals(MultiLanguagePM.Caption.WINDOW_TITLE.getEnglish(),        languagePM.getApplicationTitle());
		assertEquals(MultiLanguagePM.Caption.GERMAN_BUTTON_TEXT.getEnglish(),  languagePM.getGermanButtonText());
		assertEquals(MultiLanguagePM.Caption.ENGLISH_BUTTON_TEXT.getEnglish(), languagePM.getEnglishButtonText());

	}
}