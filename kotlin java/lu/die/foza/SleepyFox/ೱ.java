package lu.die.foza.SleepyFox;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@Retention(AnnotationRetention.SOURCE)
@Target(
   allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FIELD, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.FUNCTION}
)
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
@java.lang.annotation.Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
public @interface ೱ {
   String content() default "Default";
}
