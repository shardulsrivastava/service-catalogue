# Service Catalogue



## CodeSpace

This repo has codespace setup and upon initialization, all the right dependencies including AWS CLI, Copilot CLI will be installed and application JAR will be generated.

## Deploy with CoPilot

```
./auto/deploy
```


## Override IAM Task and Execution Role

Override IAM role with the IAM policies required for [Cloudwatch signal](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Application-Signals-Enable-ECS.html) [here](service-catalogue/copilot/api/overrides/cfn.patches.yml).

Validate these patches:

```bash
copilot svc package --diff
```

Execute the patch:

```bash
copilot svc deploy
```

## Override ECS Task Definition




