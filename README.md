# GlideMan
Glide图片加载框架的简单二次封装（建造者模式）  
</br>
###### 加载url、res、file、asset、path图片
----------
### 效果图:</br>
<table>
    <tr>
        <td><img src="http://perry.ren/glideman/img1.jpg"></td>
        <td><img src="http://perry.ren/glideman/img2.jpg"></td>
        <td><img src="http://perry.ren/glideman/img3.jpg"></td>
    </tr>
</table>
</br></br>  

### 依赖：</br>  
----------  
##### Step 1.  
###### 添加Jitpack到您的root gradle，如果无法导包，一般情况下都是这个原因，请仔细检查
 ```xml
     allprojects {
        repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 ```
##### Step 2.
###### 在需要使用到的Module中添加以下依赖
 ```xml
    dependencies {
		compile 'com.github.weipeilong123:GlideMan:1.0.2'
	}
 ```
----------  
## 使用方法：</br>  
###### 1.加载图片  
 ```java
 new GlideMan.Builder()
             .load(URL)
             .into(imageView);
 ```
###### 2.加载圆形图片  
 ```java
  .circle()
 ```
###### 3.加载圆角图片  
  ```java
  .round(10)
  ```
###### 4.设置占位图  
  ```java
  .loadingRes(R.drawable.image_loading)
  .loadFailRes(R.drawable.image_load_fail)
  ```
###### 5.指定图片大小
  ```java
  .size(200,300)
  ```
###### 6.解决第一次加载时出现大小不正常的情况
  ```java
  .dotAnimation(10)
  ```
----------  
## 注意：</br>  
###### library中已添加以下依赖，无需重复添加  
  ```xml
    compile 'com.github.bumptech.glide:glide:3.7.0'
    compile 'jp.wasabeef:glide-transformations:2.0.2'
   ```
</br></br>  
----------
## ProGuard：</br>
###### 这里贴一下Glide的混淆规则：  
  ```xml
    -keep public class * implements com.bumptech.glide.module.GlideModule
	-keep public class * extends com.bumptech.glide.AppGlideModule
	-keep public enum com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$** {
	  **[] $VALUES;
	  public *;
	}
	# for DexGuard only
	-keepresourcexmlelements manifest/application/meta-data@value=GlideModule
   ```
