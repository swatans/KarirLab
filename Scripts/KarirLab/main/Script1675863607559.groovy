import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

/**
 * This test case finds broken <a href="..."> tags in web pages and report
 */

int brokenLinks = 0

brokenLinks += WebUI.callTestCase(findTestCase("KarirLab/findLinksWiki"),
	["pageUrl": "https://www.wikipedia.org/"])


// more pages to check as many as you want ...

if (brokenLinks > 0) {
	KeywordUtil.markFailed("one or more broken links are found")
}