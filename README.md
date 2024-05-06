# Service Catalogue



## CodeSpace

This repo has codespace setup and upon initialization, all the right dependencies including AWS CLI, Copilot CLI will be installed and application JAR will be generated.

## Deploy with CoPilot

```
copilot init --app service-catalogue --name api --type "Load Balanced Web Service" --dockerfile "./Dockerfile" --deploy
```


## Override Defaults

Override IAM role with the IAM policies required for [Cloudwatch signal](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Application-Signals-Enable-ECS.html) [here](service-catalogue/copilot/api/overrides/cfn.patches.yml).

validate these patches:

```bash
copilot svc package --diff
```

Execute the patch:

```bash
copilot svc deploy
```

