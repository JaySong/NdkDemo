//
// Created by Q.Jay on 2016/5/8.
//
#include <com_jay_ndkdemo_JniDemo.h>

/*
 * Class:     com_jay_ndkdemo_JniDemo
 * Method:    getHelloWordText
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_jay_ndkdemo_JniDemo_getHelloWordText
  (JNIEnv * env, jobject obj)
{
 jclass clazz = env->FindClass("com/jay/ndkdemo/MainActivity");
  jmethodID id = env->GetStaticMethodID(clazz, "showToast","()V");
   env->CallStaticVoidMethod(clazz,id);
 return env->NewStringUTF("Hello Word From Jni <C++>");
}