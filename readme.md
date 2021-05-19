This application is a demo for a problem when applying
@ConditionalOnProperty on @Bean methods in a @Configuration class.

See [Spring boot issue 26954](https://github.com/spring-projects/spring-framework/issues/26954)

In here we set up two beans and one Service, on depends on the next.

PartyService (@Service) depends on ChiliConCarne (@Bean) depends on KidneyBean (@Bean)

As a tasty spice we added @ConditionalOnBean on the ChiliConCarne Bean factory method.

When we try to start the application it fails: The ChiliConfig will be evaluated before the KidneyConfig, so the @ConditionalOnBean on the ChiliConfig returns false - there isn't a KidneyBean, yet.

Refactoring and just renaming the KidneyConfig to AAAKidneyConfig makes things work, because now AAAKidneyConfig is evaluated in front of ChiliConfig, so when ChiliConfig's @ConditionalOnBean is run, then the KidneyBean will exist.

See the branch [working](https://github.com/froh42/spring-issue-demo-26964/tree/working) for the version with the renamed config. That one starts up. 


If both Configuration classes are in different namespaces things get even more strange, it looks like it is dependent on luck (or dirent ordering in the filesystem) whether one or the other config is parsed first - making startup nondeterministic and dependent on chance.
