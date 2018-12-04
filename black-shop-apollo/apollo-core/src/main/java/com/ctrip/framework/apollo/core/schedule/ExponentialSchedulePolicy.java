package com.ctrip.framework.apollo.core.schedule;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public class ExponentialSchedulePolicy implements SchedulePolicy {
  private final long delayTimeLowerBound;
  private final long delayTimeUpperBound;
  private long lastDelayTime;

  public ExponentialSchedulePolicy(long delayTimeLowerBound, long delayTimeUpperBound) {
    this.delayTimeLowerBound = delayTimeLowerBound;
    this.delayTimeUpperBound = delayTimeUpperBound;
  }

  @Override
  public long fail() {
    long delayTime = lastDelayTime;

    if (delayTime == 0) {
      delayTime = delayTimeLowerBound;
    } else {
      delayTime = Math.min(lastDelayTime << 1, delayTimeUpperBound);
    }

    lastDelayTime = delayTime;

    return delayTime;
  }

  @Override
  public void success() {
    lastDelayTime = 0;
  }
}
