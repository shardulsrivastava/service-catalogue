# Service Catalogue


## CodeSpace

This repo has codespace setup and upon initialization, all the right dependencies including AWS CLI, Copilot CLI will be installed and application JAR will be generated.

## Deploy with CoPilot

```bash
export AWS_ACCESS_KEY_ID=
export AWS_SECRET_ACCESS_KEY=
export AWS_DEFAULT_REGION=us-east-1
./auto/deploy
```

check the logs:

```bash
copilot svc logs --previous
```

## Override IAM Task and Execution Role

Override IAM role with the IAM policies required for [Cloudwatch signal](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Application-Signals-Enable-ECS.html) [here](service-catalogue/copilot/api/overrides/cfn.patches.yml).

ECS Task Definition [reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinition.html)

Validate these patches:

```bash
copilot svc package --diff
```

Execute the patch:

```bash
copilot svc deploy
```

optionally add `--force` to force deployment with the newly created image.
