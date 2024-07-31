13 lesson - Внедрение зависимостей должно проходить через конструктор -
//    @Autowired
//    public MyController(Teacher teacher) {
//
//        this.teacher = teacher;
//    }

Если такой возможности нет, то можно применять и методы (сеттеры)

@Autowired
    public void testMethod(Teacher teacher) {
        this.teacher = teacher;
    }

    @Autowired
        public void setTeacher(Teacher teacher) {
            this.teacher = teacher;
        }

 14 lesson - в старых проектах могут использовать поле как зависимость

    @Autowired
    private Teacher teacher;

  15th lesson - have been learned the @Qualifier annotation. This annotation necessary to point to one
   of the bean. For example, we have several methods/beans and for correct run a code necessary
    to define any method as  @Qualifier.

                 @Autowired
                    public MyController(@Qualifier("laborTeacher") Teacher teacher) {

                        this.teacher = teacher;
                    }

    16th lesson - to define the order of the bean we able to use @Primary annotation. @Primary annotation
    is suitable to use with @Qualifier annotation,  but @Qualifier annotation is most priority
     then @Primary.
                    @Component
                    @Primary
                    public class HistoryTeacher implements Teacher

     17th lesson - added @Lazy annotation to resume start of a bean
     @Component
     @Lazy
     public class MathTeacher implements Teacher {
        Also we can use multiply Lazy annotation over the application.properties file
        * spring.main.lazy-initialization=true *

     18th lesson - learned the @Scope annotation. It defines "singleTone" or "prototype"
        method of a Bean creating. "Singleton" creates one bean, "Prototype" creates two beans

        //@Scope("prototype") // first way to define the Scope
        @Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE) //second way to define a @Scope

     19th lesson - learned annotations @PostConstruct and @PreDestroy. @PostConstruct performs
     immediately when constructor was initialised. @PreDestroy performs when Bean closed.

     20 lesson - When a @Scope("prototype"), then @PreDestroy annotation does not work. It works
      when @Scope("singleton").

     @Component
     @Scope("prototype")
     public class MathTeacher implements Teacher {
         public MathTeacher() {
             System.out.println("Bean of the class" + this.getClass().getSimpleName());
         }

         @PostConstruct
         public void firstMethod(){
             System.out.println("firstMethod");
         }

         @PreDestroy
         public void secondMethod(){
             System.out.println("secondMethod");
         }