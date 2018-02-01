set projectLocation=C:\Users\shashi.k\Desktop\DynamicOnboarding\onbordingDynamicV1_13102017.zip_expanded\OnboardingProcess
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\ExternalLib\*;%projectLocation%\SourceLib\*
java org.testng.TestNG %projectLocation%\resultZip.xml
pause