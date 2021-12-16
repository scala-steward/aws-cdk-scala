inThisBuild(
  List(
    organization := "io.burkard",
    homepage := Some(url("https://github.com/NickBurkard/aws-cdk-scala")),
    licenses := List("Apache 2" -> url("https://github.com/NickBurkard/aws-cdk-scala/blob/master/LICENSE.txt")),
    developers := List(
      Developer(
        "NickBurkard",
        "Nick Burkard",
        "burkard.foss@gmail.com",
        url("https://burkard.io")
      )
    ),
    sonatypeCredentialHost := Sonatype.sonatype01
  )
)

lazy val awsCdkScala = project
  .in(file("."))
  .aggregate(
    example,
    accessanalyzer,
    acmpca,
    alexa,
    amazonmq,
    amplify,
    apigateway,
    apigatewayv2,
    appconfig,
    appflow,
    appintegrations,
    applicationautoscaling,
    applicationinsights,
    appmesh,
    apprunner,
    appstream,
    appsync,
    aps,
    athena,
    auditmanager,
    autoscaling,
    autoscalingplans,
    backup,
    batch,
    budgets,
    cassandra,
    ce,
    certificatemanager,
    chatbot,
    cloud9,
    cloudassembly,
    cloudformation,
    cloudfront,
    cloudtrail,
    cloudwatch,
    codeartifact,
    codebuild,
    codecommit,
    codedeploy,
    codeguruprofiler,
    codegurureviewer,
    codepipeline,
    codestar,
    codestarconnections,
    codestarnotifications,
    cognito,
    config,
    connect,
    core,
    cur,
    customerprofiles,
    customresources,
    cxapi,
    databrew,
    datapipeline,
    datasync,
    dax,
    detective,
    devopsguru,
    directoryservice,
    dlm,
    dms,
    docdb,
    dynamodb,
    ec2,
    ecr,
    ecs,
    efs,
    eks,
    elasticache,
    elasticbeanstalk,
    elasticloadbalancing,
    elasticloadbalancingv2,
    elasticsearch,
    emr,
    emrcontainers,
    events,
    eventschemas,
    finspace,
    fis,
    fms,
    frauddetector,
    fsx,
    gamelift,
    globalaccelerator,
    glue,
    greengrass,
    greengrassv2,
    groundstation,
    guardduty,
    healthlake,
    iam,
    imagebuilder,
    inspector,
    iot,
    iot1click,
    iotanalytics,
    iotcoredeviceadvisor,
    iotevents,
    iotfleethub,
    iotsitewise,
    iotthingsgraph,
    iotwireless,
    ivs,
    kendra,
    kinesis,
    kinesisanalytics,
    kinesisfirehose,
    kms,
    lakeformation,
    lambda,
    licensemanager,
    lightsail,
    location,
    logs,
    lookoutequipment,
    lookoutmetrics,
    lookoutvision,
    macie,
    managedblockchain,
    mediaconnect,
    mediaconvert,
    medialive,
    mediapackage,
    mediastore,
    memorydb,
    msk,
    mwaa,
    neptune,
    networkfirewall,
    networkmanager,
    nimblestudio,
    opensearchservice,
    opsworks,
    opsworkscm,
    panorama,
    pinpoint,
    pinpointemail,
    pipelines,
    qldb,
    quicksight,
    ram,
    rds,
    redshift,
    rekognition,
    resourcegroups,
    robomaker,
    route53,
    route53recoverycontrol,
    route53recoveryreadiness,
    route53resolver,
    s3,
    s3objectlambda,
    s3outposts,
    sagemaker,
    sam,
    sdb,
    secretsmanager,
    securityhub,
    servicecatalog,
    servicecatalogappregistry,
    servicediscovery,
    ses,
    signer,
    sns,
    sqs,
    ssm,
    ssmcontacts,
    ssmincidents,
    sso,
    stepfunctions,
    synthetics,
    timestream,
    transfer,
    waf,
    wafv2,
    wisdom,
    workspaces,
    xray
  )
  .disablePublishing()

lazy val example = project
  .dependsOn(
    core,
    kinesisanalytics,
    s3
  )
  .withCdk()
  .disablePublishing()

lazy val accessanalyzer = project
  .in(file("modules/accessanalyzer"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val acmpca = project
  .in(file("modules/acmpca"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val alexa = project
  .in(file("modules/alexa"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val amazonmq = project
  .in(file("modules/amazonmq"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val amplify = project
  .in(file("modules/amplify"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val apigateway = project
  .in(file("modules/apigateway"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val apigatewayv2 = project
  .in(file("modules/apigatewayv2"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val appconfig = project
  .in(file("modules/appconfig"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val appflow = project
  .in(file("modules/appflow"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val appintegrations = project
  .in(file("modules/appintegrations"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val applicationautoscaling = project
  .in(file("modules/applicationautoscaling"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val applicationinsights = project
  .in(file("modules/applicationinsights"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val appmesh = project
  .in(file("modules/appmesh"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val apprunner = project
  .in(file("modules/apprunner"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val appstream = project
  .in(file("modules/appstream"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val appsync = project
  .in(file("modules/appsync"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val aps = project
  .in(file("modules/aps"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val athena = project
  .in(file("modules/athena"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val auditmanager = project
  .in(file("modules/auditmanager"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val autoscaling = project
  .in(file("modules/autoscaling"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val autoscalingplans = project
  .in(file("modules/autoscalingplans"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val backup = project
  .in(file("modules/backup"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val batch = project
  .in(file("modules/batch"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val budgets = project
  .in(file("modules/budgets"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val cassandra = project
  .in(file("modules/cassandra"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val ce = project
  .in(file("modules/ce"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val certificatemanager = project
  .in(file("modules/certificatemanager"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val chatbot = project
  .in(file("modules/chatbot"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val cloud9 = project
  .in(file("modules/cloud9"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val cloudassembly = project
  .in(file("modules/cloudassembly"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val cloudformation = project
  .in(file("modules/cloudformation"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val cloudfront = project
  .in(file("modules/cloudfront"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val cloudtrail = project
  .in(file("modules/cloudtrail"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val cloudwatch = project
  .in(file("modules/cloudwatch"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val codeartifact = project
  .in(file("modules/codeartifact"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val codebuild = project
  .in(file("modules/codebuild"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val codecommit = project
  .in(file("modules/codecommit"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val codedeploy = project
  .in(file("modules/codedeploy"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val codeguruprofiler = project
  .in(file("modules/codeguruprofiler"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val codegurureviewer = project
  .in(file("modules/codegurureviewer"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val codepipeline = project
  .in(file("modules/codepipeline"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val codestar = project
  .in(file("modules/codestar"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val codestarconnections = project
  .in(file("modules/codestarconnections"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val codestarnotifications = project
  .in(file("modules/codestarnotifications"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val cognito = project
  .in(file("modules/cognito"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val config = project
  .in(file("modules/config"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val connect = project
  .in(file("modules/connect"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val core = project
  .in(file("modules/core"))
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val cur = project
  .in(file("modules/cur"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val customerprofiles = project
  .in(file("modules/customerprofiles"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val customresources = project
  .in(file("modules/customresources"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val cxapi = project
  .in(file("modules/cxapi"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val databrew = project
  .in(file("modules/databrew"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val datapipeline = project
  .in(file("modules/datapipeline"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val datasync = project
  .in(file("modules/datasync"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val dax = project
  .in(file("modules/dax"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val detective = project
  .in(file("modules/detective"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val devopsguru = project
  .in(file("modules/devopsguru"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val directoryservice = project
  .in(file("modules/directoryservice"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val dlm = project
  .in(file("modules/dlm"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val dms = project
  .in(file("modules/dms"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val docdb = project
  .in(file("modules/docdb"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val dynamodb = project
  .in(file("modules/dynamodb"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val ec2 = project
  .in(file("modules/ec2"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val ecr = project
  .in(file("modules/ecr"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val ecs = project
  .in(file("modules/ecs"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val efs = project
  .in(file("modules/efs"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val eks = project
  .in(file("modules/eks"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val elasticache = project
  .in(file("modules/elasticache"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val elasticbeanstalk = project
  .in(file("modules/elasticbeanstalk"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val elasticloadbalancing = project
  .in(file("modules/elasticloadbalancing"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val elasticloadbalancingv2 = project
  .in(file("modules/elasticloadbalancingv2"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val elasticsearch = project
  .in(file("modules/elasticsearch"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val emr = project
  .in(file("modules/emr"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val emrcontainers = project
  .in(file("modules/emrcontainers"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val events = project
  .in(file("modules/events"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val eventschemas = project
  .in(file("modules/eventschemas"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val finspace = project
  .in(file("modules/finspace"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val fis = project
  .in(file("modules/fis"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val fms = project
  .in(file("modules/fms"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val frauddetector = project
  .in(file("modules/frauddetector"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val fsx = project
  .in(file("modules/fsx"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val gamelift = project
  .in(file("modules/gamelift"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val globalaccelerator = project
  .in(file("modules/globalaccelerator"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val glue = project
  .in(file("modules/glue"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val greengrass = project
  .in(file("modules/greengrass"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val greengrassv2 = project
  .in(file("modules/greengrassv2"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val groundstation = project
  .in(file("modules/groundstation"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val guardduty = project
  .in(file("modules/guardduty"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val healthlake = project
  .in(file("modules/healthlake"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val iam = project
  .in(file("modules/iam"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val imagebuilder = project
  .in(file("modules/imagebuilder"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val inspector = project
  .in(file("modules/inspector"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val iot = project
  .in(file("modules/iot"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val iot1click = project
  .in(file("modules/iot1click"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val iotanalytics = project
  .in(file("modules/iotanalytics"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val iotcoredeviceadvisor = project
  .in(file("modules/iotcoredeviceadvisor"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val iotevents = project
  .in(file("modules/iotevents"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val iotfleethub = project
  .in(file("modules/iotfleethub"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val iotsitewise = project
  .in(file("modules/iotsitewise"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val iotthingsgraph = project
  .in(file("modules/iotthingsgraph"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val iotwireless = project
  .in(file("modules/iotwireless"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val ivs = project
  .in(file("modules/ivs"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val kendra = project
  .in(file("modules/kendra"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val kinesis = project
  .in(file("modules/kinesis"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val kinesisanalytics = project
  .in(file("modules/kinesisanalytics"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val kinesisfirehose = project
  .in(file("modules/kinesisfirehose"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val kms = project
  .in(file("modules/kms"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val lakeformation = project
  .in(file("modules/lakeformation"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val lambda = project
  .in(file("modules/lambda"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val licensemanager = project
  .in(file("modules/licensemanager"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val lightsail = project
  .in(file("modules/lightsail"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val location = project
  .in(file("modules/location"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val logs = project
  .in(file("modules/logs"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val lookoutequipment = project
  .in(file("modules/lookoutequipment"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val lookoutmetrics = project
  .in(file("modules/lookoutmetrics"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val lookoutvision = project
  .in(file("modules/lookoutvision"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val macie = project
  .in(file("modules/macie"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val managedblockchain = project
  .in(file("modules/managedblockchain"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val mediaconnect = project
  .in(file("modules/mediaconnect"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val mediaconvert = project
  .in(file("modules/mediaconvert"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val medialive = project
  .in(file("modules/medialive"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val mediapackage = project
  .in(file("modules/mediapackage"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val mediastore = project
  .in(file("modules/mediastore"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val memorydb = project
  .in(file("modules/memorydb"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val msk = project
  .in(file("modules/msk"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val mwaa = project
  .in(file("modules/mwaa"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val neptune = project
  .in(file("modules/neptune"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val networkfirewall = project
  .in(file("modules/networkfirewall"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val networkmanager = project
  .in(file("modules/networkmanager"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val nimblestudio = project
  .in(file("modules/nimblestudio"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val opensearchservice = project
  .in(file("modules/opensearchservice"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val opsworks = project
  .in(file("modules/opsworks"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val opsworkscm = project
  .in(file("modules/opsworkscm"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val panorama = project
  .in(file("modules/panorama"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val pinpoint = project
  .in(file("modules/pinpoint"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val pinpointemail = project
  .in(file("modules/pinpointemail"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val pipelines = project
  .in(file("modules/pipelines"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val qldb = project
  .in(file("modules/qldb"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val quicksight = project
  .in(file("modules/quicksight"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val ram = project
  .in(file("modules/ram"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val rds = project
  .in(file("modules/rds"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val redshift = project
  .in(file("modules/redshift"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val rekognition = project
  .in(file("modules/rekognition"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val resourcegroups = project
  .in(file("modules/resourcegroups"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val robomaker = project
  .in(file("modules/robomaker"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val route53 = project
  .in(file("modules/route53"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val route53recoverycontrol = project
  .in(file("modules/route53recoverycontrol"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val route53recoveryreadiness = project
  .in(file("modules/route53recoveryreadiness"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val route53resolver = project
  .in(file("modules/route53resolver"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val s3 = project
  .in(file("modules/s3"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val s3objectlambda = project
  .in(file("modules/s3objectlambda"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val s3outposts = project
  .in(file("modules/s3outposts"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val sagemaker = project
  .in(file("modules/sagemaker"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val sam = project
  .in(file("modules/sam"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val sdb = project
  .in(file("modules/sdb"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val secretsmanager = project
  .in(file("modules/secretsmanager"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val securityhub = project
  .in(file("modules/securityhub"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val servicecatalog = project
  .in(file("modules/servicecatalog"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val servicecatalogappregistry = project
  .in(file("modules/servicecatalogappregistry"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val servicediscovery = project
  .in(file("modules/servicediscovery"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val ses = project
  .in(file("modules/ses"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val signer = project
  .in(file("modules/signer"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val sns = project
  .in(file("modules/sns"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val sqs = project
  .in(file("modules/sqs"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val ssm = project
  .in(file("modules/ssm"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val ssmcontacts = project
  .in(file("modules/ssmcontacts"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val ssmincidents = project
  .in(file("modules/ssmincidents"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val sso = project
  .in(file("modules/sso"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val stepfunctions = project
  .in(file("modules/stepfunctions"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val synthetics = project
  .in(file("modules/synthetics"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val timestream = project
  .in(file("modules/timestream"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val transfer = project
  .in(file("modules/transfer"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val waf = project
  .in(file("modules/waf"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val wafv2 = project
  .in(file("modules/wafv2"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val wisdom = project
  .in(file("modules/wisdom"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val workspaces = project
  .in(file("modules/workspaces"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()

lazy val xray = project
  .in(file("modules/xray"))
  .dependsOn(core)
  .withCodegen()
  .withCdk()
  .enablePublishing()
