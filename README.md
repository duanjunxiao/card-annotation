# card-annotation
## Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
## Step 2. Add the dependency
	
	dependencies {
		compile 'com.github.duanjunxiao.card-annotation:cardlib:v0.0.2'
                apt 'com.github.duanjunxiao.card-annotation:compiler:v0.0.2'
	}
	
## Step 3. Just to use
	@CardMap(MainCard.class)
        public class MainActivity ...{
	   ...
	}
	
  
